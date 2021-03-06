package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_FromObject
import typings.fabric.Anon_FromObjectObject
import typings.fabric.Anon_FromObjectObjectOptions
import typings.fabric.Anon_FromObjectObjectOptionsAnonBlocksize
import typings.fabric.Anon_FromObjectObjectOptionsAnonChannel
import typings.fabric.Anon_FromObjectObjectOptionsAnonColorOpacity
import typings.fabric.Anon_FromObjectObjectOptionsAnonColorString
import typings.fabric.Anon_FromObjectObjectOptionsAnonContrast
import typings.fabric.Anon_FromObjectObjectOptionsAnonDistance
import typings.fabric.Anon_FromObjectObjectOptionsAnonMatrix
import typings.fabric.Anon_FromObjectObjectOptionsAnonMatrixOpaque
import typings.fabric.Anon_FromObjectObjectOptionsAnonNoise
import typings.fabric.Anon_FromObjectObjectOptionsAnonSaturation
import typings.fabric.Anon_FromObjectObjectOptionsAnonThreshold
import typings.fabric.Anon_FromObjectObjectOptionsAny
import typings.fabric.Anon_FromObjectObjectOptionsAnyIInvertFilter
import typings.fabric.Anon_FromObjectObjectOptionsAnyIResizeFilter
import typings.fabric.Anon_FromObjectObjectOptionsAnyISepia2Filter
import typings.fabric.Anon_FromObjectObjectOptionsAnyISepiaFilter
import typings.fabric.Anon_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends js.Object {
  var BaseFilter: Anon_Options
  var BlendColor: Anon_FromObject
  var BlendImage: Anon_FromObjectObject
  var Brightness: Anon_FromObjectObjectOptions
  var ColorMatrix: Anon_FromObjectObjectOptionsAnonMatrix
  var Contrast: Anon_FromObjectObjectOptionsAnonContrast
  var Convolute: Anon_FromObjectObjectOptionsAnonMatrixOpaque
  var GradientTransparency: Anon_FromObjectObjectOptionsAnonThreshold
  var Grayscale: Anon_FromObjectObjectOptionsAny
  var Invert: Anon_FromObjectObjectOptionsAnyIInvertFilter
  var Mask: Anon_FromObjectObjectOptionsAnonChannel
  var Multiply: Anon_FromObjectObjectOptionsAnonColorString
  var Noise: Anon_FromObjectObjectOptionsAnonNoise
  var Pixelate: Anon_FromObjectObjectOptionsAnonBlocksize
  var RemoveWhite: Anon_FromObjectObjectOptionsAnonDistance
  var Resize: Anon_FromObjectObjectOptionsAnyIResizeFilter
  var Saturation: Anon_FromObjectObjectOptionsAnonSaturation
  var Sepia: Anon_FromObjectObjectOptionsAnyISepiaFilter
  var Sepia2: Anon_FromObjectObjectOptionsAnyISepia2Filter
  var Tint: Anon_FromObjectObjectOptionsAnonColorOpacity
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: Anon_Options,
    BlendColor: Anon_FromObject,
    BlendImage: Anon_FromObjectObject,
    Brightness: Anon_FromObjectObjectOptions,
    ColorMatrix: Anon_FromObjectObjectOptionsAnonMatrix,
    Contrast: Anon_FromObjectObjectOptionsAnonContrast,
    Convolute: Anon_FromObjectObjectOptionsAnonMatrixOpaque,
    GradientTransparency: Anon_FromObjectObjectOptionsAnonThreshold,
    Grayscale: Anon_FromObjectObjectOptionsAny,
    Invert: Anon_FromObjectObjectOptionsAnyIInvertFilter,
    Mask: Anon_FromObjectObjectOptionsAnonChannel,
    Multiply: Anon_FromObjectObjectOptionsAnonColorString,
    Noise: Anon_FromObjectObjectOptionsAnonNoise,
    Pixelate: Anon_FromObjectObjectOptionsAnonBlocksize,
    RemoveWhite: Anon_FromObjectObjectOptionsAnonDistance,
    Resize: Anon_FromObjectObjectOptionsAnyIResizeFilter,
    Saturation: Anon_FromObjectObjectOptionsAnonSaturation,
    Sepia: Anon_FromObjectObjectOptionsAnyISepiaFilter,
    Sepia2: Anon_FromObjectObjectOptionsAnyISepia2Filter,
    Tint: Anon_FromObjectObjectOptionsAnonColorOpacity
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAllFilters]
  }
}

