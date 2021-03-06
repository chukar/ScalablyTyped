package typings.gapiDotDrive.gapi.client.drive

import typings.gapiDotDrive.Anon_Aperture
import typings.gapiDotDrive.Anon_CanAddChildren
import typings.gapiDotDrive.Anon_DisplayName
import typings.gapiDotDrive.Anon_DurationMillis
import typings.gapiDotDrive.Anon_Hidden
import typings.gapiDotDrive.Anon_Image
import typings.gapiDotDrive.Anon_Text
import typings.gapiDotDrive.gapiDotDriveStrings.driveNumbersignfile
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResource extends js.Object {
  var alternateLink: String
  var appDataContents: Boolean
  var canComment: Boolean
  var canReadRevisions: Boolean
  var capabilities: Anon_CanAddChildren
  var copyable: Boolean
  var createdDate: Date
  // openWithLinks
  var defaultOpenWithLink: String
  var description: String
  var downloadUrl: String
  var editable: Boolean
  var embedLink: String
  var etag: String
  var explicitlyTrashed: Boolean
  var fileExtension: String
  var fileSize: Double
  var folderColorRgb: String
  var fullFileExtension: String
  var hasAugmentedPermissions: Boolean
  var hasThumbnail: Boolean
  var headRevisionId: String
  var iconLink: String
  var id: String
  var imageMediaMetadata: Anon_Aperture
  // exportLinks
  var indexableText: Anon_Text
  var isAppAuthorized: Boolean
  var kind: driveNumbersignfile
  var labels: Anon_Hidden
  var lastModifyingUser: Anon_DisplayName
  var lastModifyingUserName: String
  var lastViewedByMeDate: Date
  var markedViewedByMeDate: Date
  var md5Checksum: String
  var mimeType: String
  var modifiedByMeDate: Date
  var modifiedDate: Date
  var originalFilename: String
  var ownedByMe: Boolean
  var ownerNames: js.Array[String]
  var owners: js.Array[Anon_DisplayName]
  var parents: js.Array[ParentResource]
  var permissions: js.Array[PermissionResource]
  var properties: js.Array[PropertiesResource]
  var quotaBytesUsed: Double
  var selfLink: String
  var shareable: Boolean
  var shared: Boolean
  var sharedWithMeDate: Date
  var sharingUser: Anon_DisplayName
  var spaces: js.Array[String]
  var teamDriveId: String
  var thumbnail: Anon_Image
  var thumbnailLink: String
  var title: String
  var trashedDate: Date
  var trashingUser: Anon_DisplayName
  var userPermission: PermissionResource
  var version: Double
  var videoMediaMetadata: Anon_DurationMillis
  var webContentLink: String
  var webViewLink: String
  var writersCanShare: Boolean
}

object FileResource {
  @scala.inline
  def apply(
    alternateLink: String,
    appDataContents: Boolean,
    canComment: Boolean,
    canReadRevisions: Boolean,
    capabilities: Anon_CanAddChildren,
    copyable: Boolean,
    createdDate: Date,
    defaultOpenWithLink: String,
    description: String,
    downloadUrl: String,
    editable: Boolean,
    embedLink: String,
    etag: String,
    explicitlyTrashed: Boolean,
    fileExtension: String,
    fileSize: Double,
    folderColorRgb: String,
    fullFileExtension: String,
    hasAugmentedPermissions: Boolean,
    hasThumbnail: Boolean,
    headRevisionId: String,
    iconLink: String,
    id: String,
    imageMediaMetadata: Anon_Aperture,
    indexableText: Anon_Text,
    isAppAuthorized: Boolean,
    kind: driveNumbersignfile,
    labels: Anon_Hidden,
    lastModifyingUser: Anon_DisplayName,
    lastModifyingUserName: String,
    lastViewedByMeDate: Date,
    markedViewedByMeDate: Date,
    md5Checksum: String,
    mimeType: String,
    modifiedByMeDate: Date,
    modifiedDate: Date,
    originalFilename: String,
    ownedByMe: Boolean,
    ownerNames: js.Array[String],
    owners: js.Array[Anon_DisplayName],
    parents: js.Array[ParentResource],
    permissions: js.Array[PermissionResource],
    properties: js.Array[PropertiesResource],
    quotaBytesUsed: Double,
    selfLink: String,
    shareable: Boolean,
    shared: Boolean,
    sharedWithMeDate: Date,
    sharingUser: Anon_DisplayName,
    spaces: js.Array[String],
    teamDriveId: String,
    thumbnail: Anon_Image,
    thumbnailLink: String,
    title: String,
    trashedDate: Date,
    trashingUser: Anon_DisplayName,
    userPermission: PermissionResource,
    version: Double,
    videoMediaMetadata: Anon_DurationMillis,
    webContentLink: String,
    webViewLink: String,
    writersCanShare: Boolean
  ): FileResource = {
    val __obj = js.Dynamic.literal(alternateLink = alternateLink.asInstanceOf[js.Any], appDataContents = appDataContents.asInstanceOf[js.Any], canComment = canComment.asInstanceOf[js.Any], canReadRevisions = canReadRevisions.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], copyable = copyable.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], defaultOpenWithLink = defaultOpenWithLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], embedLink = embedLink.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], explicitlyTrashed = explicitlyTrashed.asInstanceOf[js.Any], fileExtension = fileExtension.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], folderColorRgb = folderColorRgb.asInstanceOf[js.Any], fullFileExtension = fullFileExtension.asInstanceOf[js.Any], hasAugmentedPermissions = hasAugmentedPermissions.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], headRevisionId = headRevisionId.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageMediaMetadata = imageMediaMetadata.asInstanceOf[js.Any], indexableText = indexableText.asInstanceOf[js.Any], isAppAuthorized = isAppAuthorized.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lastModifyingUser = lastModifyingUser.asInstanceOf[js.Any], lastModifyingUserName = lastModifyingUserName.asInstanceOf[js.Any], lastViewedByMeDate = lastViewedByMeDate.asInstanceOf[js.Any], markedViewedByMeDate = markedViewedByMeDate.asInstanceOf[js.Any], md5Checksum = md5Checksum.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modifiedByMeDate = modifiedByMeDate.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any], ownedByMe = ownedByMe.asInstanceOf[js.Any], ownerNames = ownerNames.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quotaBytesUsed = quotaBytesUsed.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], shareable = shareable.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], sharedWithMeDate = sharedWithMeDate.asInstanceOf[js.Any], sharingUser = sharingUser.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], teamDriveId = teamDriveId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], thumbnailLink = thumbnailLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trashedDate = trashedDate.asInstanceOf[js.Any], trashingUser = trashingUser.asInstanceOf[js.Any], userPermission = userPermission.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], videoMediaMetadata = videoMediaMetadata.asInstanceOf[js.Any], webContentLink = webContentLink.asInstanceOf[js.Any], webViewLink = webViewLink.asInstanceOf[js.Any], writersCanShare = writersCanShare.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileResource]
  }
}

