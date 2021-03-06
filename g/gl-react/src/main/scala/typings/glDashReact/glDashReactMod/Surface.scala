package typings.glDashReact.glDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Component
import typings.std.Blob
import typings.std.WebGLBuffer
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react", "Surface")
@js.native
class Surface[T] ()
  extends Component[SurfaceProps, SurfaceState, js.Any] {
  var buffer: WebGLBuffer = js.native
  var gl: js.UndefOr[WebGLRenderingContext] = js.native
  var glView: T = js.native
  var id: Double = js.native
  var loaderResolver: js.UndefOr[js.Any] = js.native
  var root: Node = js.native
  var shaders: StringDictionary[js.Any] = js.native
  def capture(): js.Array[_] = js.native
  def capture(x: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double): js.Array[_] = js.native
  def capture(x: Double, y: Double, w: Double, h: Double): js.Array[_] = js.native
  def captureAsBlob(args: js.Any*): js.Promise[Blob] = js.native
  def captureAsDataURL(args: js.Any*): String = js.native
  def flush(): Unit = js.native
  def getEmptyTexture(): WebGLTexture = js.native
  def getGLName(): String = js.native
  def getGLShortName(): String = js.native
  def getGLSize(): js.Tuple2[Double, Double] = js.native
  def getVisitors(): js.Array[Visitor] = js.native
  def glIsAvailable(): Boolean = js.native
  def mapRenderableContent(inst: js.Any): js.Any = js.native
  def rebootForDebug(): Unit = js.native
  def redraw(): Unit = js.native
}

