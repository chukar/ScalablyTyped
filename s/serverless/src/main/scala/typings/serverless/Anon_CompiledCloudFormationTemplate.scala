package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompiledCloudFormationTemplate extends js.Object {
  var compiledCloudFormationTemplate: Anon_Key
  var name: String
  var region: String
  var runtime: js.UndefOr[String] = js.undefined
  var stage: String
  var timeout: js.UndefOr[Double] = js.undefined
  var versionFunctions: Boolean
}

object Anon_CompiledCloudFormationTemplate {
  @scala.inline
  def apply(
    compiledCloudFormationTemplate: Anon_Key,
    name: String,
    region: String,
    stage: String,
    versionFunctions: Boolean,
    runtime: String = null,
    timeout: Int | Double = null
  ): Anon_CompiledCloudFormationTemplate = {
    val __obj = js.Dynamic.literal(compiledCloudFormationTemplate = compiledCloudFormationTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], versionFunctions = versionFunctions.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompiledCloudFormationTemplate]
  }
}

