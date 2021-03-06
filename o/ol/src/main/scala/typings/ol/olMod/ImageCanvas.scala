package typings.ol.olMod

import typings.ol.extentMod.Extent
import typings.ol.imageCanvasMod.Loader
import typings.ol.imageCanvasMod.default
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "ImageCanvas")
@js.native
class ImageCanvas protected () extends default {
  def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
  def this(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    canvas: HTMLCanvasElement,
    opt_loader: Loader
  ) = this()
}

