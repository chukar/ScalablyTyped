package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEventType
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected ()
  extends typings.atAngularCompiler.srcCompilerMod.TmplAstBoundEvent {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: String,
    phase: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: String,
    phase: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: Null,
    phase: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: Null,
    phase: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "TmplAstBoundEvent")
@js.native
object TmplAstBoundEvent extends js.Object {
  def fromParsedEvent(event: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEvent): BoundEvent = js.native
}

