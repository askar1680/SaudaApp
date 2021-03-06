package kz.kinopoisk.kotlin.models.video

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VideoResults {
  @SerializedName("results")
  @Expose
  var videos: List<Video>? = null
}