package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides document-specific information such as the author, creation date, and user-defined fields.
  *
  * This interface manages access to document meta-data properties. Such properties may be set from the outside via the setter methods (e.g. when
  * importing arbitrary document formats that support document properties), or imported from an ODF package via the methods {@link loadFromStorage()} and
  * {@link loadFromMedium()} . The properties may also be stored via the methods {@link storeToStorage()} and {@link storeToMedium()} .
  * @see XDocumentPropertiesSupplier for getting access to an instance from a loaded document
  * @see DocumentProperties for a service that implements this interface
  * @since OOo 3.0
  */
trait XDocumentProperties extends js.Object {
  /** contains the initial author of the document. */
  var Author: String
  /**
    * contains the number of seconds after which a specified URL is to be loaded after the document is loaded into a desktop frame.
    *
    * A value of 0 is valid and describes a redirection. A value of 0 together with an empty `string` as {@link AutoloadURL} describes a case where no
    * autoload is specified.
    * @see AutoloadURL
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var AutoloadSecs: Double
  /**
    * contains the URL to load automatically at a specified time after the document is loaded into a desktop frame.
    *
    * An empty URL is valid and describes a case where the document shall be reloaded from its original location after some time described by the attribute
    * {@link AutoloadSecs} . An empty `string` together with an {@link AutoloadSecs} value of 0 describes a case where no autoload is specified.
    * @see AutoloadSecs
    */
  var AutoloadURL: String
  /** contains the date and time when the document was created. */
  var CreationDate: DateTime
  /**
    * contains the name of the default frame into which links should be loaded if no target is specified.
    *
    * This applies to the autoload feature too, but to others as well.
    */
  var DefaultTarget: String
  /**
    * contains a multi-line comment describing the document.
    *
    * Line delimiters can be UNIX, Macintosh or DOS style.
    */
  var Description: String
  /**
    * contains some statistics about the document.
    *
    * The contained statistics may be specific to the type of the document.
    */
  var DocumentStatistics: SafeArray[NamedValue]
  /**
    * describes how often the document was edited and saved.
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var EditingCycles: Double
  /**
    * contains the net time of editing the document (in seconds).
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var EditingDuration: Double
  /**
    * identifies which application was used to create or last modify the document.
    *
    * The generating application will set this attribute when it creates a new document or it saves a document. When a document is loaded that itself
    * contains such an attribute it will be preserved until the document is saved again.
    */
  var Generator: String
  /** contains a list of keywords for the document. */
  var Keywords: SafeArray[String]
  /** contains the default language of the document. */
  var Language: Locale
  /**
    * contains the date and time of the last time the document was stored.
    *
    * If the document has never been stored, contains a default value.
    */
  var ModificationDate: DateTime
  /** contains the name of the person who most recently stored the document. */
  var ModifiedBy: String
  /**
    * contains the date and time when the document was last printed.
    *
    * If the document has never been printed, contains a default value.
    */
  var PrintDate: DateTime
  /** contains the name of the person who most recently printed the document. */
  var PrintedBy: String
  /** contains the subject of the document. */
  var Subject: String
  /** contains the date and time of when the document was created or updated from the template. */
  var TemplateDate: DateTime
  /**
    * contains the name of the template from which the document was created.
    *
    * The value is an empty `string` if the document was not created from a template or if it was detached from the template.
    */
  var TemplateName: String
  /**
    * contains the URL of the template from which the document was created.
    *
    * The value is an empty `string` if the document was not created from a template or if it was detached from the template.
    */
  var TemplateURL: String
  /** contains the title of the document. */
  var Title: String
  /**
    * provides access to a container for user-defined properties.
    *
    * The returned object also implements the interface {@link com.sun.star.beans.XPropertySet} .
    * @returns a container that provides access to user-defined properties
    */
  val UserDefinedProperties: XPropertyContainer
  /**
    * provides access to a container for user-defined properties.
    *
    * The returned object also implements the interface {@link com.sun.star.beans.XPropertySet} .
    * @returns a container that provides access to user-defined properties
    */
  def getUserDefinedProperties(): XPropertyContainer
  /**
    * loads document properties from an ODF package or an OLE container.
    * @param URL the URL of the source document The URL could be part of the Medium parameter, but because often no other parameters except the URL are needed
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source
    * @throws com::sun::star::io::WrongFormatException if parsing the XML document fails
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when trying to open a stream in the given storage
    */
  def loadFromMedium(URL: String, Medium: SeqEquiv[PropertyValue]): Unit
  /**
    * loads document properties from an ODF package.
    *
    * This method is used for accessing an ODF package that is owned by someone else, e.g., a document.
    * @param Storage the {@link com.sun.star.embed.Storage} representing the ODF package
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source This is unfortunately necessary in order to properly resolve rel
    * @throws com::sun::star::lang::IllegalArgumentException if argument is `NULL`
    * @throws com::sun::star::io::WrongFormatException if parsing the XML document fails
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when trying to open a stream in the given storage
    */
  def loadFromStorage(Storage: XStorage, Medium: SeqEquiv[PropertyValue]): Unit
  /**
    * resets all attributes that could identify the user.
    *
    * Clears the document properties, such that it appears the document has just been created. This is a convenience method which resets several attributes
    * at once, as follows: {@link Author} is set to the given parameter.{@link CreationDate} is set to the current date and time.{@link ModifiedBy} is
    * cleared.{@link ModificationDate} is cleared.{@link PrintedBy} is cleared.{@link PrintDate} is cleared.{@link EditingDuration} is cleared.{@link
    * EditingCycles} is set to 1.
    * @param Author the new value of the {@link Author} attribute.
    */
  def resetUserData(Author: String): Unit
  /**
    * stores document properties to an ODF package or an OLE container.
    * @param URL the URL of the target document The URL could be part of the Medium parameter, but because often no other parameters except the URL are needed
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the target
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when writing to the storage
    */
  def storeToMedium(URL: String, Medium: SeqEquiv[PropertyValue]): Unit
  /**
    * stores document properties to an ODF package.
    *
    * This method is used for accessing an ODF package that is owned by someone else, e.g., a document. Note that the implementation may choose to store the
    * meta-data in either OOo or ODF format, depending on the MediaType property of the given Storage argument.
    * @param Storage the {@link com.sun.star.embed.Storage} representing the ODF package
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source This is unfortunately necessary in order to properly resolve rel
    * @throws com::sun::star::lang::IllegalArgumentException if argument is `NULL`
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when writing to the storage
    */
  def storeToStorage(Storage: XStorage, Medium: SeqEquiv[PropertyValue]): Unit
}

object XDocumentProperties {
  @scala.inline
  def apply(
    Author: String,
    AutoloadSecs: Double,
    AutoloadURL: String,
    CreationDate: DateTime,
    DefaultTarget: String,
    Description: String,
    DocumentStatistics: SafeArray[NamedValue],
    EditingCycles: Double,
    EditingDuration: Double,
    Generator: String,
    Keywords: SafeArray[String],
    Language: Locale,
    ModificationDate: DateTime,
    ModifiedBy: String,
    PrintDate: DateTime,
    PrintedBy: String,
    Subject: String,
    TemplateDate: DateTime,
    TemplateName: String,
    TemplateURL: String,
    Title: String,
    UserDefinedProperties: XPropertyContainer,
    getUserDefinedProperties: () => XPropertyContainer,
    loadFromMedium: (String, SeqEquiv[PropertyValue]) => Unit,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit,
    resetUserData: String => Unit,
    storeToMedium: (String, SeqEquiv[PropertyValue]) => Unit,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit
  ): XDocumentProperties = {
    val __obj = js.Dynamic.literal(Author = Author, AutoloadSecs = AutoloadSecs, AutoloadURL = AutoloadURL, CreationDate = CreationDate, DefaultTarget = DefaultTarget, Description = Description, DocumentStatistics = DocumentStatistics, EditingCycles = EditingCycles, EditingDuration = EditingDuration, Generator = Generator, Keywords = Keywords, Language = Language, ModificationDate = ModificationDate, ModifiedBy = ModifiedBy, PrintDate = PrintDate, PrintedBy = PrintedBy, Subject = Subject, TemplateDate = TemplateDate, TemplateName = TemplateName, TemplateURL = TemplateURL, Title = Title, UserDefinedProperties = UserDefinedProperties, getUserDefinedProperties = js.Any.fromFunction0(getUserDefinedProperties), loadFromMedium = js.Any.fromFunction2(loadFromMedium), loadFromStorage = js.Any.fromFunction2(loadFromStorage), resetUserData = js.Any.fromFunction1(resetUserData), storeToMedium = js.Any.fromFunction2(storeToMedium), storeToStorage = js.Any.fromFunction2(storeToStorage))
  
    __obj.asInstanceOf[XDocumentProperties]
  }
}

