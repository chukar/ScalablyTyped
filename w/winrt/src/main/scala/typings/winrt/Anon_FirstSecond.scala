package typings.winrt

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecond extends js.Object {
  var first: IMapView[String, _]
  var second: IMapView[String, _]
}

object Anon_FirstSecond {
  @scala.inline
  def apply(first: IMapView[String, _], second: IMapView[String, _]): Anon_FirstSecond = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FirstSecond]
  }
}

