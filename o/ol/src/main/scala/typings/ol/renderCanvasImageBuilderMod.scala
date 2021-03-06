package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ImageBuilder", JSImport.Namespace)
@js.native
object renderCanvasImageBuilderMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.renderCanvasBuilderMod.default {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  type CanvasImageBuilder = typings.ol.renderCanvasBuilderMod.default
}

