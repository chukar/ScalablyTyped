package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  /**
    * The channel object encapsulates branding properties of the channel page.
    */
  var channel: Anon_DefaultTab
  /**
    * The hints object encapsulates additional branding properties
    */
  var hints: js.Array[Anon_Property]
  /**
    * The image object encapsulates information about images that display on the channels channel page or video watch pages.
    */
  var image: Anon_BackgroundImageUrl
  /**
    * The watch object encapsulates branding properties of the watch pages for the channels videos.
    */
  var watch: Anon_BackgroundColor
}

object Anon_Channel {
  @scala.inline
  def apply(
    channel: Anon_DefaultTab,
    hints: js.Array[Anon_Property],
    image: Anon_BackgroundImageUrl,
    watch: Anon_BackgroundColor
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

