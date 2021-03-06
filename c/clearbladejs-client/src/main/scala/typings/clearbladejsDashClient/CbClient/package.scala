package typings.clearbladejsDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbClient {
  import org.scalablytyped.runtime.StringDictionary

  type CbCallback = js.Function2[/* error */ Boolean, /* response */ Resp, Unit]
  type ItemOptions = CollectionOptionsWithID
  type MessageCallback = js.Function1[/* message */ String, Unit]
  type QueryFilter = StringDictionary[QueryFilterValue]
  type QueryFilterValue = StringDictionary[QueryValue]
  type QueryValue = String | Double | Boolean
}
