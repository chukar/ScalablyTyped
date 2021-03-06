package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentStatistics extends js.Object {
  /**
    * The number of text documents indexed.
    */
  var IndexedTextDocumentsCount: typings.awsDashSdk.clientsKendraMod.IndexedTextDocumentsCount = js.native
}

object TextDocumentStatistics {
  @scala.inline
  def apply(IndexedTextDocumentsCount: IndexedTextDocumentsCount): TextDocumentStatistics = {
    val __obj = js.Dynamic.literal(IndexedTextDocumentsCount = IndexedTextDocumentsCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextDocumentStatistics]
  }
}

