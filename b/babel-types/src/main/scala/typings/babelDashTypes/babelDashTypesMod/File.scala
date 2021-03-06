package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends Node {
  var comments: js.Array[Comment]
  var program: Program
  var tokens: js.Array[_]
  @JSName("type")
  var type_File: typings.babelDashTypes.babelDashTypesStrings.File
}

object File {
  @scala.inline
  def apply(
    comments: js.Array[Comment],
    end: Double,
    loc: SourceLocation,
    program: Program,
    start: Double,
    tokens: js.Array[_],
    `type`: typings.babelDashTypes.babelDashTypesStrings.File,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): File = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

@JSImport("babel-types", "file")
@js.native
object file extends js.Object {
  def apply(): File = js.native
  def apply(program: Program): File = js.native
  def apply(program: Program, comments: js.Array[Comment]): File = js.native
  def apply(program: Program, comments: js.Array[Comment], tokens: js.Array[_]): File = js.native
}

