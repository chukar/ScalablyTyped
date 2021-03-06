package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuac_redirect extends js.Object {
  def get_redirects(max_c: Double, max_b: Double): Double
  def get_redirects_acc(max_c: Double, max_b: Double, reason: String): Double
  def get_redirects_all(): Double
}

object Typeofuac_redirect {
  @scala.inline
  def apply(
    get_redirects: (Double, Double) => Double,
    get_redirects_acc: (Double, Double, String) => Double,
    get_redirects_all: () => Double
  ): Typeofuac_redirect = {
    val __obj = js.Dynamic.literal(get_redirects = js.Any.fromFunction2(get_redirects), get_redirects_acc = js.Any.fromFunction3(get_redirects_acc), get_redirects_all = js.Any.fromFunction0(get_redirects_all))
  
    __obj.asInstanceOf[Typeofuac_redirect]
  }
}

