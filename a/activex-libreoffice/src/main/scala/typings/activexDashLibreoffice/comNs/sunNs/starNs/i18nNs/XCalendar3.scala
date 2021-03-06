package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to locale specific calendar systems.
  *
  * It is derived from {@link com.sun.star.i18n.XExtendedCalendar} and provides additional methods to obtain {@link Calendar2} items that include the
  * possessive genitive case month names and sequences of {@link CalendarItem2} items..
  * @since LibreOffice 3.5
  */
trait XCalendar3 extends XExtendedCalendar {
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  val Days2: SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  val GenitiveMonths2: SafeArray[CalendarItem2]
  val LoadedCalendar2: Calendar2
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  val Months2: SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  val PartitiveMonths2: SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  def getDays2(): SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  def getGenitiveMonths2(): SafeArray[CalendarItem2]
  def getLoadedCalendar2(): Calendar2
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  def getMonths2(): SafeArray[CalendarItem2]
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  def getPartitiveMonths2(): SafeArray[CalendarItem2]
}

object XCalendar3 {
  @scala.inline
  def apply(
    DateTime: Double,
    Days: SafeArray[CalendarItem],
    Days2: SafeArray[CalendarItem2],
    FirstDayOfWeek: Double,
    GenitiveMonths2: SafeArray[CalendarItem2],
    LoadedCalendar: Calendar,
    LoadedCalendar2: Calendar2,
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    Months2: SafeArray[CalendarItem2],
    NumberOfDaysInWeek: Double,
    NumberOfMonthsInYear: Double,
    PartitiveMonths2: SafeArray[CalendarItem2],
    UniqueID: String,
    acquire: () => Unit,
    addValue: (Double, Double) => Unit,
    getAllCalendars: Locale => SafeArray[String],
    getDateTime: () => Double,
    getDays: () => SafeArray[CalendarItem],
    getDays2: () => SafeArray[CalendarItem2],
    getDisplayName: (Double, Double, Double) => String,
    getDisplayString: (Double, Double) => String,
    getFirstDayOfWeek: () => Double,
    getGenitiveMonths2: () => SafeArray[CalendarItem2],
    getLoadedCalendar: () => Calendar,
    getLoadedCalendar2: () => Calendar2,
    getMinimumNumberOfDaysForFirstWeek: () => Double,
    getMonths: () => SafeArray[CalendarItem],
    getMonths2: () => SafeArray[CalendarItem2],
    getNumberOfDaysInWeek: () => Double,
    getNumberOfMonthsInYear: () => Double,
    getPartitiveMonths2: () => SafeArray[CalendarItem2],
    getUniqueID: () => String,
    getValue: Double => Double,
    isValid: () => Boolean,
    loadCalendar: (String, Locale) => Unit,
    loadDefaultCalendar: Locale => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDateTime: Double => Unit,
    setFirstDayOfWeek: Double => Unit,
    setMinimumNumberOfDaysForFirstWeek: Double => Unit,
    setValue: (Double, Double) => Unit
  ): XCalendar3 = {
    val __obj = js.Dynamic.literal(DateTime = DateTime, Days = Days, Days2 = Days2, FirstDayOfWeek = FirstDayOfWeek, GenitiveMonths2 = GenitiveMonths2, LoadedCalendar = LoadedCalendar, LoadedCalendar2 = LoadedCalendar2, MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek, Months = Months, Months2 = Months2, NumberOfDaysInWeek = NumberOfDaysInWeek, NumberOfMonthsInYear = NumberOfMonthsInYear, PartitiveMonths2 = PartitiveMonths2, UniqueID = UniqueID, acquire = js.Any.fromFunction0(acquire), addValue = js.Any.fromFunction2(addValue), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = js.Any.fromFunction0(getDateTime), getDays = js.Any.fromFunction0(getDays), getDays2 = js.Any.fromFunction0(getDays2), getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getGenitiveMonths2 = js.Any.fromFunction0(getGenitiveMonths2), getLoadedCalendar = js.Any.fromFunction0(getLoadedCalendar), getLoadedCalendar2 = js.Any.fromFunction0(getLoadedCalendar2), getMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction0(getMinimumNumberOfDaysForFirstWeek), getMonths = js.Any.fromFunction0(getMonths), getMonths2 = js.Any.fromFunction0(getMonths2), getNumberOfDaysInWeek = js.Any.fromFunction0(getNumberOfDaysInWeek), getNumberOfMonthsInYear = js.Any.fromFunction0(getNumberOfMonthsInYear), getPartitiveMonths2 = js.Any.fromFunction0(getPartitiveMonths2), getUniqueID = js.Any.fromFunction0(getUniqueID), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction0(isValid), loadCalendar = js.Any.fromFunction2(loadCalendar), loadDefaultCalendar = js.Any.fromFunction1(loadDefaultCalendar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDateTime = js.Any.fromFunction1(setDateTime), setFirstDayOfWeek = js.Any.fromFunction1(setFirstDayOfWeek), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1(setMinimumNumberOfDaysForFirstWeek), setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[XCalendar3]
  }
}

