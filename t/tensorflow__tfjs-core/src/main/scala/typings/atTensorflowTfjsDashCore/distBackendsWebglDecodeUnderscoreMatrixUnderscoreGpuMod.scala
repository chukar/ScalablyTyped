package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.PackingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/decode_matrix_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglDecodeUnderscoreMatrixUnderscoreGpuMod extends js.Object {
  @js.native
  class DecodeMatrixProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    @JSName("outPackingScheme")
    var outPackingScheme_DecodeMatrixProgram: PackingScheme = js.native
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("outputShape")
    var outputShape_DecodeMatrixProgram: js.Tuple3[Double, Double, Double] = js.native
    @JSName("packedInputs")
    var packedInputs_DecodeMatrixProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_DecodeMatrixProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

