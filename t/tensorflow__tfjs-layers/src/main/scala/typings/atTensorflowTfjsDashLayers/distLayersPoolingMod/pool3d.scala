package typings.atTensorflowTfjsDashLayers.distLayersPoolingMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PaddingMode
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PoolMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "pool3d")
@js.native
object pool3d extends js.Object {
  def apply(x: Tensor5D, poolSize: js.Tuple3[Double, Double, Double]): Tensor[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  def apply(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = js.native
}

