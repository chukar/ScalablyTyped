package typings.gapiDotClientDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  /** The thumbnail data encoded with URL-safe Base64 (RFC 4648 section 5). */
  var image: js.UndefOr[String] = js.undefined
  /** The MIME type of the thumbnail. */
  var mimeType: js.UndefOr[String] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(image: String = null, mimeType: String = null): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Image]
  }
}

