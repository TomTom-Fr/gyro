/* DO NOT EDIT | Generated by gyro */

import RealmSwift
import Foundation

final class FidelityCard: Object {

  enum Attributes: String {
    case identifier = "identifier"
    case points = "points"
  }

  enum Relationships: String {
    case user = "user"
  }

  dynamic var identifier: Int16 = 0
  dynamic var points: Int32 = 0
  dynamic var user: User?

  override static func primaryKey() -> String? {
    return "identifier"
  }

}
