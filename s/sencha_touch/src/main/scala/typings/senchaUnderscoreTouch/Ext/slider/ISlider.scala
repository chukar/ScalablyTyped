package typings.senchaUnderscoreTouch.Ext.slider

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends IContainer {
  /** [Config Option] (Boolean) */
  var allowThumbsOverlapping: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var animation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var animationDuration: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the increment configuration
  		* @param increment Number
  		* @returns Number
  		*/
  var applyIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Returns the value of allowThumbsOverlapping
  		* @returns Boolean
  		*/
  var getAllowThumbsOverlapping: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of animation
  		* @returns Boolean/Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the Thumb instance bound to this Slider
  		* @param index Number The index of Thumb to return.
  		* @returns Ext.slider.Thumb The thumb instance
  		*/
  var getThumb: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IThumb]] = js.undefined
  /** [Method] Returns the value of thumbConfig
  		* @returns Object
  		*/
  var getThumbConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the Thumb instances bound to this Slider
  		* @returns Ext.slider.Thumb[] The thumb instances
  		*/
  var getThumbs: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns Number/Number[]
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Convenience method
  		* @returns Object
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of allowThumbsOverlapping
  		* @param allowThumbsOverlapping Boolean The new value.
  		*/
  var setAllowThumbsOverlapping: js.UndefOr[js.Function1[/* allowThumbsOverlapping */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of animation
  		* @param animation Boolean/Object The new value.
  		*/
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of thumbConfig
  		* @param thumbConfig Object The new value.
  		*/
  var setThumbConfig: js.UndefOr[js.Function1[/* thumbConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Number/Number[] The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Convenience method
  		* @param value Object
  		*/
  var setValues: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var thumbConfig: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the sliders thumbs with their new value s
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  var updateValue: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Number[]) */
  var values: js.UndefOr[js.Any] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowThumbsOverlapping: js.UndefOr[Boolean] = js.undefined,
    animation: js.Any = null,
    animationDuration: js.UndefOr[Boolean] = js.undefined,
    applyIncrement: /* increment */ js.UndefOr[Double] => Double = null,
    getAllowThumbsOverlapping: () => Boolean = null,
    getAnimation: () => _ = null,
    getIncrement: () => Double = null,
    getMaxValue: () => Double = null,
    getMinValue: () => Double = null,
    getReadOnly: () => Boolean = null,
    getThumb: /* index */ js.UndefOr[Double] => IThumb = null,
    getThumbConfig: () => _ = null,
    getThumbs: () => Array = null,
    getValue: () => _ = null,
    getValues: () => _ = null,
    increment: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    setAllowThumbsOverlapping: /* allowThumbsOverlapping */ js.UndefOr[Boolean] => Unit = null,
    setAnimation: /* animation */ js.UndefOr[js.Any] => Unit = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Unit = null,
    setMaxValue: /* maxValue */ js.UndefOr[Double] => Unit = null,
    setMinValue: /* minValue */ js.UndefOr[Double] => Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Unit = null,
    setThumbConfig: /* thumbConfig */ js.UndefOr[js.Any] => Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    setValues: /* value */ js.UndefOr[js.Any] => Unit = null,
    thumbConfig: js.Any = null,
    updateValue: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Unit = null,
    value: js.Any = null,
    values: js.Any = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowThumbsOverlapping)) __obj.updateDynamic("allowThumbsOverlapping")(allowThumbsOverlapping.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (applyIncrement != null) __obj.updateDynamic("applyIncrement")(js.Any.fromFunction1(applyIncrement))
    if (getAllowThumbsOverlapping != null) __obj.updateDynamic("getAllowThumbsOverlapping")(js.Any.fromFunction0(getAllowThumbsOverlapping))
    if (getAnimation != null) __obj.updateDynamic("getAnimation")(js.Any.fromFunction0(getAnimation))
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(js.Any.fromFunction0(getIncrement))
    if (getMaxValue != null) __obj.updateDynamic("getMaxValue")(js.Any.fromFunction0(getMaxValue))
    if (getMinValue != null) __obj.updateDynamic("getMinValue")(js.Any.fromFunction0(getMinValue))
    if (getReadOnly != null) __obj.updateDynamic("getReadOnly")(js.Any.fromFunction0(getReadOnly))
    if (getThumb != null) __obj.updateDynamic("getThumb")(js.Any.fromFunction1(getThumb))
    if (getThumbConfig != null) __obj.updateDynamic("getThumbConfig")(js.Any.fromFunction0(getThumbConfig))
    if (getThumbs != null) __obj.updateDynamic("getThumbs")(js.Any.fromFunction0(getThumbs))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction0(getValues))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (setAllowThumbsOverlapping != null) __obj.updateDynamic("setAllowThumbsOverlapping")(js.Any.fromFunction1(setAllowThumbsOverlapping))
    if (setAnimation != null) __obj.updateDynamic("setAnimation")(js.Any.fromFunction1(setAnimation))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1(setIncrement))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (setThumbConfig != null) __obj.updateDynamic("setThumbConfig")(js.Any.fromFunction1(setThumbConfig))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (setValues != null) __obj.updateDynamic("setValues")(js.Any.fromFunction1(setValues))
    if (thumbConfig != null) __obj.updateDynamic("thumbConfig")(thumbConfig.asInstanceOf[js.Any])
    if (updateValue != null) __obj.updateDynamic("updateValue")(js.Any.fromFunction2(updateValue))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlider]
  }
}

