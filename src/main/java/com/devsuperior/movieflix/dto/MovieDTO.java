package com.devsuperior.movieflix.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;

public class MovieDTO {

	 private Long id;
	 private String title;
	 private String subTitle;
	 private Integer year;
	 private String imgUrl;
	 private String synopsis;
	 private GenreDTO genre;
	 
	 private List<ReviewDTO> reviews = new ArrayList<>();
	 
	 public MovieDTO() {
		 
	 }

	public MovieDTO(Long id, String title, String subTitle, Integer year, String imgUrl, 
			String synopsis, GenreDTO genre) {
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genre = genre;
	}
	 
	public MovieDTO(Movie entity) {
		id = entity.getId();
		title = entity.getTitle();
		subTitle = entity.getSubTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
		genre = new GenreDTO(entity.getGenre());
	}

	public MovieDTO(Movie entity, Set<Review> reviews) {
		this(entity);
		reviews.forEach(rev -> this.reviews.add(new ReviewDTO(rev)));
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
	public String getSynopsis() {
		return synopsis;
	}

	public GenreDTO getGenre() {
		return genre;
	}

	public void setGenre(GenreDTO genre) {
		this.genre = genre;
	}

	public List<ReviewDTO> getReviews() {
		return reviews;
	}
	 
}
