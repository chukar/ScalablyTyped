package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "reshape")
@js.native
object reshape extends js.Object {
  def apply[R2 /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
}

