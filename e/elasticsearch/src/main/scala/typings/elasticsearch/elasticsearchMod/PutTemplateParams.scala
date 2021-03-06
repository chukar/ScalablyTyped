package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTemplateParams extends GenericParams {
  var id: String
}

object PutTemplateParams {
  @scala.inline
  def apply(
    id: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null
  ): PutTemplateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTemplateParams]
  }
}

