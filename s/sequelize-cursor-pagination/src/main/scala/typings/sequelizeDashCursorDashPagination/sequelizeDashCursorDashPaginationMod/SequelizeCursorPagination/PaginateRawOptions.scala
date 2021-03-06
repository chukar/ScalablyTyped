package typings.sequelizeDashCursorDashPagination.sequelizeDashCursorDashPaginationMod.SequelizeCursorPagination

import typings.sequelize.Anon_Exclude
import typings.sequelize.sequelizeMod.FindOptionsAttributesArray
import typings.sequelize.sequelizeMod.IncludeOptions
import typings.sequelize.sequelizeMod.Model
import typings.sequelize.sequelizeMod.WhereOptions
import typings.sequelize.sequelizeMod.and
import typings.sequelize.sequelizeMod.col
import typings.sequelize.sequelizeMod.fn
import typings.sequelize.sequelizeMod.or
import typings.sequelize.sequelizeMod.where
import typings.sequelizeDashCursorDashPagination.sequelizeDashCursorDashPaginationBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateRawOptions[T] extends BasicPaginateOptions[T] {
  var raw: `true`
}

object PaginateRawOptions {
  @scala.inline
  def apply[T](
    raw: `true`,
    after: String = null,
    attributes: FindOptionsAttributesArray | Anon_Exclude = null,
    before: String = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: Int | Double = null,
    paginationField: String = null,
    subQuery: js.UndefOr[Boolean] = js.undefined,
    where: WhereOptions[T] | where | fn | (js.Array[col | and | or | String]) = null
  ): PaginateRawOptions[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField.asInstanceOf[js.Any])
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateRawOptions[T]]
  }
}

