package typings.atJimpBmp

import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.DecoderFn
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ImagebmpImagexmsbmp extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp_Original: DecoderFn = js.native
  @JSName("image/x-ms-bmp")
  var `imageSlashx-ms-bmp_Original`: DecoderFn = js.native
  @JSName("image/bmp")
  def imageSlashbmp(data: Buffer): Bitmap = js.native
  @JSName("image/x-ms-bmp")
  def `imageSlashx-ms-bmp`(data: Buffer): Bitmap = js.native
}

