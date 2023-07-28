package com.shopping.service;

import java.util.List;

import com.shopping.exception.ProductException;
import com.shopping.modal.Rating;
import com.shopping.modal.User;
import com.shopping.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
