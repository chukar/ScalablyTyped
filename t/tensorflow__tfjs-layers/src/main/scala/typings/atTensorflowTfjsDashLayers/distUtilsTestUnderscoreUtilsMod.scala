package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/test_utils", JSImport.Namespace)
@js.native
object distUtilsTestUnderscoreUtilsMod extends js.Object {
  def describeMathCPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def describeMathCPUAndGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def describeMathGPU(testName: String, tests: js.Function0[Unit]): Unit = js.native
  def expectNoLeakedTensors(testFunc: js.Function0[_], numNewTensors: Double): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double]): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: js.Array[Double], epsilon: Double): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: Tensor[Rank]): Unit = js.native
  def expectTensorsClose(actual: js.Array[Double], expected: Tensor[Rank], epsilon: Double): Unit = js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: js.Array[Double]): Unit = js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: js.Array[Double], epsilon: Double): Unit = js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: Tensor[Rank]): Unit = js.native
  def expectTensorsClose(actual: Tensor[Rank], expected: Tensor[Rank], epsilon: Double): Unit = js.native
  def expectTensorsValuesInRange(actual: Tensor[Rank], low: Double, high: Double): Unit = js.native
}

