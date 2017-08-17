package io.aboullaite.feingclient.controller;

import io.aboullaite.feingclient.feign.TwitterClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Twitter {

    @Autowired
    TwitterClient twitterClient;

    @RequestMapping("/{hashtag}")
    public String tweets(@PathVariable String hashtag, Model model){
        model.addAttribute("tweets", twitterClient.getTweets(hashtag));
        model.addAttribute("hashtag", hashtag);
        return "tweets-view";
    }
}
