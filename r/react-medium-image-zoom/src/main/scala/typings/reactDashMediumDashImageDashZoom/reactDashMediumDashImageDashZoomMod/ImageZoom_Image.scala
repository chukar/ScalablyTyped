package typings.reactDashMediumDashImageDashZoom.reactDashMediumDashImageDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageZoom_Image extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var src: String
  var style: js.UndefOr[js.Object] = js.undefined
}

object ImageZoom_Image {
  @scala.inline
  def apply(src: String, alt: String = null, className: String = null, style: js.Object = null): ImageZoom_Image = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageZoom_Image]
  }
}

