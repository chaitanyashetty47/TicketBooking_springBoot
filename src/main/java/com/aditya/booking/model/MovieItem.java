package com.aditya.booking.model;

import jakarta.annotation.Resource;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
@Getter
public class MovieItem {


    private final String title ;
    private final Resource thumbnailImage;
    private final Resource image;

    private final String movieInfo;

    private final List<Resource> castImages;






}
