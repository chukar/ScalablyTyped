package typings.yandexDashMoneyDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Article extends js.Object {
  var article: js.Array[Anon_MerchantArticleId]
  var bonus: js.Array[Anon_Secret]
}

object Anon_Article {
  @scala.inline
  def apply(article: js.Array[Anon_MerchantArticleId], bonus: js.Array[Anon_Secret]): Anon_Article = {
    val __obj = js.Dynamic.literal(article = article.asInstanceOf[js.Any], bonus = bonus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Article]
  }
}

