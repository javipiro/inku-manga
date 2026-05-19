package com.duoc.inkumanga.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JikanMangaDTO {

    private MangaData data;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MangaData {
        @JsonProperty("mal_id")
        private Integer malId;

        private String title;
        private String status;   
        private Integer chapters;
        private Integer volumes;
        private Double score;
        private String synopsis;

        @JsonProperty("title_english")
        private String titleEnglish;

        private List<Genre> genres;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Genre {
        private String name;
    }
}