package typings.fastDashCsv.buildSrcParserParserTokenMod

import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/Token", "Token")
@js.native
class Token protected () extends js.Object {
  def this(tokenArgs: TokenArgs) = this()
  val endCursor: Double = js.native
  val startCursor: Double = js.native
  val token: String = js.native
}

/* static members */
@JSImport("fast-csv/build/src/parser/parser/Token", "Token")
@js.native
object Token extends js.Object {
  def isTokenCarriageReturn(token: Token, parserOptions: ParserOptions): Boolean = js.native
  def isTokenComment(token: Token, parserOptions: ParserOptions): Boolean = js.native
  def isTokenDelimiter(token: Token, parserOptions: ParserOptions): Boolean = js.native
  def isTokenEscapeCharacter(token: Token, parserOptions: ParserOptions): Boolean = js.native
  def isTokenQuote(token: Token, parserOptions: ParserOptions): Boolean = js.native
  def isTokenRowDelimiter(token: Token): Boolean = js.native
}

