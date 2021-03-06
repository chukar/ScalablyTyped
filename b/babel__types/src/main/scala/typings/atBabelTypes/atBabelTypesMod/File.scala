package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File
  extends BaseNode
     with _Node {
  var comments: js.Any
  var program: Program
  var tokens: js.Any
  @JSName("type")
  var type_File: typings.atBabelTypes.atBabelTypesStrings.File
}

object File {
  @scala.inline
  def apply(
    comments: js.Any,
    program: Program,
    tokens: js.Any,
    `type`: typings.atBabelTypes.atBabelTypesStrings.File,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): File = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

@JSImport("@babel/types", "file")
@js.native
object file extends js.Object {
  def apply(program: Program, comments: js.Any, tokens: js.Any): File = js.native
}

