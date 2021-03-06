package typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.Anon_FlatOffset
import typings.atTensorflowTfjsDashCore.Anon_ImagRealRank
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureData extends js.Object {
  var complexTensors: js.UndefOr[Anon_ImagRealRank] = js.undefined
  var dtype: DataType
  var isPacked: js.UndefOr[Boolean] = js.undefined
  var shape: js.Array[Double]
  var slice: js.UndefOr[Anon_FlatOffset] = js.undefined
  /** [rows, columns] shape of the texture. */
  var texShape: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var texture: js.UndefOr[WebGLTexture] = js.undefined
  var usage: js.UndefOr[TextureUsage] = js.undefined
  var values: js.UndefOr[BackendValues] = js.undefined
}

object TextureData {
  @scala.inline
  def apply(
    dtype: DataType,
    shape: js.Array[Double],
    complexTensors: Anon_ImagRealRank = null,
    isPacked: js.UndefOr[Boolean] = js.undefined,
    slice: Anon_FlatOffset = null,
    texShape: js.Tuple2[Double, Double] = null,
    texture: WebGLTexture = null,
    usage: TextureUsage = null,
    values: BackendValues = null
  ): TextureData = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    if (complexTensors != null) __obj.updateDynamic("complexTensors")(complexTensors.asInstanceOf[js.Any])
    if (!js.isUndefined(isPacked)) __obj.updateDynamic("isPacked")(isPacked.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    if (texShape != null) __obj.updateDynamic("texShape")(texShape.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureData]
  }
}

