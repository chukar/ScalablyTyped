package typings.typedoc.distLibTsDashInternalMod

import typings.std.Map
import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.list
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.object_
import typings.typedoc.typedocStrings.string
import typings.typescript.typescriptMod.DiagnosticMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineOptionBase extends js.Object {
  var description: js.UndefOr[DiagnosticMessage] = js.undefined
  var experimental: js.UndefOr[Boolean] = js.undefined
  var isFilePath: js.UndefOr[Boolean] = js.undefined
  var isTSConfigOnly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var paramType: js.UndefOr[DiagnosticMessage] = js.undefined
  var shortName: js.UndefOr[String] = js.undefined
  var `type`: string | number | boolean | object_ | list | (Map[Double | String, _])
}

object CommandLineOptionBase {
  @scala.inline
  def apply(
    name: String,
    `type`: string | number | boolean | object_ | list | (Map[Double | String, _]),
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOptionBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptionBase]
  }
}

