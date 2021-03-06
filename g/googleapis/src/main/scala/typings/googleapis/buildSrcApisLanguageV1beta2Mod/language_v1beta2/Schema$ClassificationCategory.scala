package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a category returned from the text classifier.
  */
@js.native
trait Schema$ClassificationCategory extends js.Object {
  /**
    * The classifier&#39;s confidence of the category. Number represents how
    * certain the classifier is that this category represents the given text.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * The name of the category representing the document, from the [predefined
    * taxonomy](/natural-language/docs/categories).
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ClassificationCategory {
  @scala.inline
  def apply(confidence: Int | Double = null, name: String = null): Schema$ClassificationCategory = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClassificationCategory]
  }
}

