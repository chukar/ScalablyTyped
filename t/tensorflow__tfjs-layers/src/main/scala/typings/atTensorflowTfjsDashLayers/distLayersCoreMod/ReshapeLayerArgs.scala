package typings.atTensorflowTfjsDashLayers.distLayersCoreMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReshapeLayerArgs extends LayerArgs {
  /** The target shape. Does not include the batch axis. */
  var targetShape: Shape
}

object ReshapeLayerArgs {
  @scala.inline
  def apply(
    targetShape: Shape,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): ReshapeLayerArgs = {
    val __obj = js.Dynamic.literal(targetShape = targetShape.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeLayerArgs]
  }
}

