package typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod

import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.MaxNormArgs
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.MinMaxNormArgs
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.UnitNormArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "constraints")
@js.native
object constraints extends js.Object {
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  def nonNeg(): Constraint = js.native
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}

