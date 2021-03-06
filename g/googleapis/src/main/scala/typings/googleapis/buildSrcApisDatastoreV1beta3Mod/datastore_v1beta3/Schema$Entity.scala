package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Datastore data object.  An entity is limited to 1 megabyte when stored.
  * That _roughly_ corresponds to a limit of 1 megabyte for the serialized form
  * of this message.
  */
@js.native
trait Schema$Entity extends js.Object {
  /**
    * The entity&#39;s key.  An entity must have a key, unless otherwise
    * documented (for example, an entity in `Value.entity_value` may have no
    * key). An entity&#39;s kind is its key path&#39;s last element&#39;s kind,
    * or null if it has no key.
    */
  var key: js.UndefOr[Schema$Key] = js.native
  /**
    * The entity&#39;s properties. The map&#39;s keys are property names. A
    * property name matching regex `__.*__` is reserved. A reserved property
    * name is forbidden in certain documented contexts. The name must not
    * contain more than 500 characters. The name cannot be `&quot;&quot;`.
    */
  var properties: js.UndefOr[StringDictionary[Schema$Value]] = js.native
}

object Schema$Entity {
  @scala.inline
  def apply(key: Schema$Key = null, properties: StringDictionary[Schema$Value] = null): Schema$Entity = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Entity]
  }
}

