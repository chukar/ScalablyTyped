package typings.vinyl

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentsReadableStream extends js.Object {
  var contents: ReadableStream
}

object Anon_ContentsReadableStream {
  @scala.inline
  def apply(contents: ReadableStream): Anon_ContentsReadableStream = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContentsReadableStream]
  }
}

