package typings.glDashShader

import typings.glDashShader.glDashShaderMod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesFragment extends js.Object {
  var attributes: js.Array[Parameter]
  var fragment: String
  var uniforms: js.Array[Parameter]
  var vertex: String
}

object Anon_AttributesFragment {
  @scala.inline
  def apply(attributes: js.Array[Parameter], fragment: String, uniforms: js.Array[Parameter], vertex: String): Anon_AttributesFragment = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AttributesFragment]
  }
}

