package typings.inversifyDashExpressDashUtils

import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.ControllerMetadata
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.ControllerMethodMetadata
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ControllerMetadata extends js.Object {
  var controllerMetadata: ControllerMetadata
  var methodMetadata: js.Array[ControllerMethodMetadata]
  var parameterMetadata: ControllerParameterMetadata
}

object Anon_ControllerMetadata {
  @scala.inline
  def apply(
    controllerMetadata: ControllerMetadata,
    methodMetadata: js.Array[ControllerMethodMetadata],
    parameterMetadata: ControllerParameterMetadata
  ): Anon_ControllerMetadata = {
    val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata.asInstanceOf[js.Any], methodMetadata = methodMetadata.asInstanceOf[js.Any], parameterMetadata = parameterMetadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ControllerMetadata]
  }
}

