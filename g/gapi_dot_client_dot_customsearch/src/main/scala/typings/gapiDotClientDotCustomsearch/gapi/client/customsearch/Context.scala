package typings.gapiDotClientDotCustomsearch.gapi.client.customsearch

import typings.gapiDotClientDotCustomsearch.Anon_Anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var facets: js.UndefOr[js.Array[js.Array[Anon_Anchor]]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply(facets: js.Array[js.Array[Anon_Anchor]] = null, title: String = null): Context = {
    val __obj = js.Dynamic.literal()
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

