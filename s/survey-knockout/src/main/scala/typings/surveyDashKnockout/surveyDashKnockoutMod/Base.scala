package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "Base")
@js.native
class Base () extends js.Object {
  /**
    * Returns true if the object is loading from Json at the current moment.
    */
  val isLoadingFromJson: Boolean = js.native
  var isLoadingFromJsonValue: Boolean = js.native
  var onPropertyChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /* protected */ def AddLocStringToUsedLocales(locStr: LocalizableString, locales: js.Array[String]): Unit = js.native
  /* protected */ def IsPropertyEmpty(value: js.Any): Boolean = js.native
  def addUsedLocales(locales: js.Array[String]): Unit = js.native
  /* protected */ def copyCssClasses(dest: js.Any, source: js.Any): Unit = js.native
  def createCustomLocalizableObj(name: String): Unit = js.native
  /* protected */ def createItemValues(name: String): js.Array[_] = js.native
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner): LocalizableString = js.native
  /* protected */ def createLocalizableString(name: String, owner: ILocalizableOwner, useMarkDown: Boolean): LocalizableString = js.native
  /* protected */ def createNewArray(name: String): js.Array[_] = js.native
  /* protected */ def createNewArray(name: String, onPush: js.Any): js.Array[_] = js.native
  /* protected */ def createNewArray(name: String, onPush: js.Any, onRemove: js.Any): js.Array[_] = js.native
  def endLoadingFromJson(): Unit = js.native
  def geValueFromHash(): js.Any = js.native
  /* protected */ def getItemValueType(): String = js.native
  def getLocalizableString(name: String): LocalizableString = js.native
  def getLocalizableStringText(name: String): String = js.native
  def getLocalizableStringText(name: String, defaultStr: String): String = js.native
  /**
    * Returns the property value by name
    * @param name property name
    */
  def getPropertyValue(name: String): js.Any = js.native
  def getPropertyValue(name: String, defaultValue: js.Any): js.Any = js.native
  /* protected */ def getPropertyValueCore(propertiesHash: js.Any, name: String): js.Any = js.native
  def getPropertyValueCoreHandler(propertiesHash: js.Any, name: String): js.Any = js.native
  /**
    * Returns the element template name without prefix. Typically it equals to getType().
    * @see getType
    */
  def getTemplate(): String = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  def getType(): String = js.native
  /* protected */ def isTwoValueEquals(x: js.Any, y: js.Any): Boolean = js.native
  /* protected */ def isTwoValueEquals(x: js.Any, y: js.Any, caseInSensitive: Boolean): Boolean = js.native
  /**
    * A static methods that returns true if a value underfined, null, empty string or empty array.
    * @param value
    */
  def isValueEmpty(value: js.Any): Boolean = js.native
  def iteratePropertiesHash(func: js.Function2[/* hash */ js.Any, /* key */ js.Any, Unit]): Unit = js.native
  def locStrsChanged(): Unit = js.native
  def onPropertyValueChangedCallback(name: String, oldValue: js.Any, newValue: js.Any, sender: Base, arrayChanges: ArrayChanges): Unit = js.native
  /* protected */ def propertyValueChanged(name: String, oldValue: js.Any, newValue: js.Any): Unit = js.native
  /* protected */ def propertyValueChanged(name: String, oldValue: js.Any, newValue: js.Any, arrayChanges: ArrayChanges): Unit = js.native
  /**
    * Register a function that will be called on a property value changed from the names list.
    * @param names the list of properties names
    * @param func the function with no parameters that will be called on property changed.
    * @param key an optional parameter. If there is already a registered function for this property witht the same key, it will be overwritten.
    */
  def registerFunctionOnPropertiesValueChanged(names: js.Array[String], func: js.Any): Unit = js.native
  def registerFunctionOnPropertiesValueChanged(names: js.Array[String], func: js.Any, key: String): Unit = js.native
  /**
    * Register a function that will be called on a property value changed.
    * @param name the property name
    * @param func the function with no parameters that will be called on property changed.
    * @param key an optional parameter. If there is already a registered function for this property witht the same key, it will be overwritten.
    */
  def registerFunctionOnPropertyValueChanged(name: String, func: js.Any): Unit = js.native
  def registerFunctionOnPropertyValueChanged(name: String, func: js.Any, key: String): Unit = js.native
  /* protected */ def setArray(src: js.Array[_], dest: js.Array[_], isItemValues: Boolean, onPush: js.Any): Unit = js.native
  def setLocalizableStringText(name: String, value: String): Unit = js.native
  /**
    * set property value
    * @param name property name
    * @param val new property value
    */
  def setPropertyValue(name: String, `val`: js.Any): Unit = js.native
  /* protected */ def setPropertyValueCore(propertiesHash: js.Any, name: String, `val`: js.Any): Unit = js.native
  def setPropertyValueCoreHandler(propertiesHash: js.Any, name: String, `val`: js.Any): Unit = js.native
  def startLoadingFromJson(): Unit = js.native
  /**
    * Deserialized the current object into JSON
    */
  def toJSON(): js.Any = js.native
  /**
    * Unregister notification on property value changed for all properties in the names list.
    * @param names the list of properties names
    * @param key the key with which you have registered the notification for this property. It can be null.
    */
  def unRegisterFunctionOnPropertiesValueChanged(names: js.Array[String]): Unit = js.native
  def unRegisterFunctionOnPropertiesValueChanged(names: js.Array[String], key: String): Unit = js.native
  /**
    * Unregister notification on property value changed
    * @param name the property name
    * @param key the key with which you have registered the notification for this property. It can be null.
    */
  def unRegisterFunctionOnPropertyValueChanged(name: String): Unit = js.native
  def unRegisterFunctionOnPropertyValueChanged(name: String, key: String): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "Base")
@js.native
object Base extends js.Object {
  var commentPrefix: String = js.native
  def createItemValue(item: js.Any): js.Any = js.native
  def createItemValue(item: js.Any, `type`: String): js.Any = js.native
  def itemValueLocStrChanged(arr: js.Array[_]): Unit = js.native
}

