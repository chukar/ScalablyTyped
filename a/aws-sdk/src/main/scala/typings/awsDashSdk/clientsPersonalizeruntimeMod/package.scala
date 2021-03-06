package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPersonalizeruntimeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type Arn = String
  type AttributeName = String
  type AttributeValue = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Context = StringDictionary[AttributeValue]
  type InputList = js.Array[ItemID]
  type ItemID = String
  type ItemList = js.Array[PredictedItem]
  type NumResults = Double
  type UserID = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-22`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
