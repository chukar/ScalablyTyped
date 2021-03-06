package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXI.particles.ParticleContainerProperties
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
/////////////////////////////PARTICLES////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "particles")
@js.native
object particles extends js.Object {
  @js.native
  class ParticleBuffer protected ()
    extends typings.pixiDotJs.PIXI.particles.ParticleBuffer {
    def this(gl: WebGLRenderingContext, properties: js.Any, dynamicPropertyFlags: js.Array[_], size: Double) = this()
  }
  
  @js.native
  class ParticleContainer ()
    extends typings.pixiDotJs.PIXI.particles.ParticleContainer {
    def this(maxSize: Double) = this()
    def this(maxSize: Double, properties: ParticleContainerProperties) = this()
    def this(maxSize: Double, properties: ParticleContainerProperties, batchSize: Double) = this()
    def this(maxSize: Double, properties: ParticleContainerProperties, batchSize: Double, autoResize: Boolean) = this()
  }
  
  @js.native
  class ParticleRenderer protected ()
    extends typings.pixiDotJs.PIXI.particles.ParticleRenderer {
    def this(renderer: typings.pixiDotJs.PIXI.WebGLRenderer) = this()
  }
  
}

