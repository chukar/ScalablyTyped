package typings.wonderDotJs

import typings.wonderDotJs.distEs2015MaterialEngineMaterialMod.EngineMaterial
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderDotJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/CommonShaderLib", JSImport.Namespace)
@js.native
object distEs2015RendererShaderLibCommonCommonShaderLibMod extends js.Object {
  @js.native
  class CommonShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object CommonShaderLib extends js.Object {
    def create(): CommonShaderLib = js.native
  }
  
}

