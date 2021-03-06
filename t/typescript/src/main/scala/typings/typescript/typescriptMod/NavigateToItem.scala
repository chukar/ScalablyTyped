package typings.typescript.typescriptMod

import typings.typescript.typescriptStrings.camelCase
import typings.typescript.typescriptStrings.exact
import typings.typescript.typescriptStrings.prefix
import typings.typescript.typescriptStrings.substring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToItem extends js.Object {
  var containerKind: ScriptElementKind
  var containerName: String
  var fileName: String
  var isCaseSensitive: Boolean
  var kind: ScriptElementKind
  var kindModifiers: String
  var matchKind: exact | prefix | substring | camelCase
  var name: String
  var textSpan: TextSpan
}

object NavigateToItem {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: String,
    fileName: String,
    isCaseSensitive: Boolean,
    kind: ScriptElementKind,
    kindModifiers: String,
    matchKind: exact | prefix | substring | camelCase,
    name: String,
    textSpan: TextSpan
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigateToItem]
  }
}

