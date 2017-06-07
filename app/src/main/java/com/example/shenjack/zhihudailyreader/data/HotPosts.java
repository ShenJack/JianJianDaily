package com.example.shenjack.zhihudailyreader.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ShenJack on 2017/6/6.
 */

public class HotPosts {
    private String date;

    @SerializedName("stories")
    private List<Post> posts;

    @SerializedName("top_stories")
    private List<Post> topStories;
}
