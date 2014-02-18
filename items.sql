-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 18, 2014 at 04:51 PM
-- Server version: 5.1.44
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tregmine2`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `item_id` int(255) NOT NULL,
  `item_data` int(255) NOT NULL DEFAULT '0',
  `item_name` varchar(255) NOT NULL,
  `enchantable` enum('no','yes') NOT NULL DEFAULT 'no',
  `sellable` enum('no','yes') NOT NULL DEFAULT 'no',
  `item_value` int(255) NOT NULL DEFAULT '0',
  `auctionable` enum('no','yes') NOT NULL DEFAULT 'no',
  `link` varchar(255) NOT NULL,
  `round` enum('no','yes') NOT NULL DEFAULT 'no',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=207 ;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`id`, `item_id`, `item_data`, `item_name`, `enchantable`, `sellable`, `item_value`, `auctionable`, `link`, `round`) VALUES
(1, 0, 0, 'Air', 'no', 'no', 0, 'no', '', 'no'),
(2, 1, 0, 'Stone', 'no', 'yes', 8, 'no', 'blocks/stone.png', 'yes'),
(3, 2, 0, 'Grass', 'no', 'yes', 5, 'no', 'blocks/grass_side.png', 'yes'),
(4, 3, 0, 'Dirt', 'no', 'yes', 3, 'no', 'blocks/dirt.png', 'yes'),
(5, 4, 0, 'Cobblestone', 'no', 'yes', 3, 'no', 'blocks/cobblestone.png', 'yes'),
(6, 5, 0, 'Wood Plank (Oak)', 'no', 'yes', 2, 'no', 'blocks/planks_oak.png', 'yes'),
(7, 5, 1, 'Wood Plank (Spruce)', 'no', 'yes', 2, 'no', 'blocks/planks_spruce.png', 'yes'),
(8, 5, 2, 'Wood Plank (Birch)', 'no', 'yes', 2, 'no', 'blocks/planks_birch.png', 'yes'),
(9, 5, 3, 'Wood Plank (Jungle)', 'no', 'yes', 2, 'no', 'blocks/planks_jungle.png', 'yes'),
(10, 6, 0, 'Sapling (Oak)', 'no', 'no', 0, 'no', 'blocks/sapling.png', 'no'),
(11, 6, 1, 'Sapling (Spruce)', 'no', 'no', 0, 'no', 'blocks/sapling_spruce.png', 'no'),
(12, 6, 2, 'Sapling (Birch)', 'no', 'no', 0, 'no', 'blocks/sapling_birch.png', 'no'),
(13, 6, 3, 'Sapling (Jungle)', 'no', 'no', 0, 'no', 'block/sapling_jungle.png', 'no'),
(14, 7, 0, 'Bedrock', 'no', 'no', 0, 'no', 'blocks/bedrock.png', 'yes'),
(15, 8, 0, 'Water', 'no', 'no', 0, 'no', 'blocks/water_flow.png', 'yes'),
(16, 9, 0, 'Water (Still)', 'no', 'no', 0, 'no', 'blocks/water_still.png', 'yes'),
(17, 10, 0, 'Lava', 'no', 'no', 0, 'no', 'blocks/lava_flow.png', 'yes'),
(18, 11, 0, 'Lava (Still)', 'no', 'no', 0, 'no', 'blocks/lava_still.png', 'yes'),
(19, 12, 0, 'Sand', 'no', 'yes', 3, 'no', 'blocks/sand.png', 'yes'),
(20, 13, 0, 'Gravel', 'no', 'yes', 7, 'no', 'blocks/gravel.png', 'yes'),
(21, 14, 0, 'Gold Ore', 'no', 'yes', 255, 'no', 'blocks/gold_ore.png', 'yes'),
(22, 15, 0, 'Iron Ore', 'no', 'yes', 65, 'no', 'blocks/iron_ore.png', 'yes'),
(23, 16, 0, 'Coal Ore', 'no', 'yes', 32, 'no', 'blocks/coal_ore.png', 'yes'),
(24, 17, 0, 'Log (Oak)', 'no', 'yes', 8, 'no', 'blocks/log_oak.png', 'yes'),
(25, 17, 1, 'Log (Spruce)', 'no', 'yes', 8, 'no', 'blocks/log_spruce.png', 'yes'),
(26, 17, 2, 'Log (Birch)', 'no', 'yes', 8, 'no', 'blocks/log_birch.png', 'yes'),
(27, 17, 3, 'Log (Jungle)', 'no', 'yes', 8, 'no', 'blocks/log_jungle.png', 'yes'),
(28, 18, 0, 'Leaves (Oak)', 'no', 'yes', 6, 'no', 'blocks/leaves_oak.png', 'yes'),
(29, 18, 1, 'Leaves (Spruce)', 'no', 'yes', 6, 'no', 'blocks/leaves_spruce.png', 'yes'),
(30, 18, 2, 'Leaves (Birch)', 'no', 'yes', 6, 'no', 'blocks/leaves_birch.png', 'yes'),
(31, 18, 3, 'Leaves (Jungle)', 'no', 'yes', 6, 'no', 'blocks/leaves_jungle.png', 'yes'),
(32, 19, 0, 'Sponge', 'no', 'no', 0, 'no', 'blocks/sponge.png', 'yes'),
(33, 20, 0, 'Glass', 'no', 'yes', 6, 'no', 'blocks/glass.png', 'yes'),
(34, 21, 0, 'Lapis Lazuli Ore', 'no', 'yes', 350, 'no', 'blocks/lapis_ore.png', 'yes'),
(35, 22, 0, 'Lapis Lazuli Block', 'no', 'yes', 495, 'no', 'blocks/lapis_block.png', 'yes'),
(36, 23, 0, 'Dispenser', 'no', 'yes', 56, 'no', 'blocks/dispenser_front_horizontal.png', 'yes'),
(37, 24, 0, 'Sandstone', 'no', 'yes', 8, 'no', 'blocks/sandstone_normal.png', 'yes'),
(38, 24, 1, 'Chiseled Sandstone', 'no', 'yes', 8, 'no', 'blocks/sandstone_carved.png', 'yes'),
(39, 24, 2, 'Smooth Sandstone', 'no', 'yes', 8, 'no', 'blocks/sandstone_smooth.png', 'yes'),
(40, 25, 0, 'Noteblock', 'no', 'yes', 45, 'no', 'blocks/noteblock.png', 'yes'),
(41, 27, 0, 'Powered Rail', 'no', 'yes', 266, 'no', 'blocks/rail_golden.png', 'no'),
(42, 28, 0, 'Detector Rail', 'no', 'yes', 78, 'no', 'blocks/rail_detector.png', 'no'),
(43, 29, 0, 'Sticky Piston', 'no', 'yes', 125, 'no', 'blocks/piston_top_sticky.png', 'yes'),
(44, 33, 0, 'Piston', 'no', 'yes', 123, 'no', 'blocks/piston_top_normal.png', 'yes'),
(45, 30, 0, 'Web', 'no', 'no', 0, 'no', 'blocks/web.png', 'no'),
(46, 31, 0, 'Dead Shrub', 'no', 'no', 0, 'no', 'blocks/deadbush.png', 'no'),
(47, 31, 1, 'Tall Grass', 'no', 'no', 0, 'no', 'blocks/tallgrass.png', 'no'),
(48, 31, 2, 'Fern', 'no', 'no', 0, 'no', 'blocks/fern.png', 'no'),
(49, 35, 0, 'White Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_white.png', 'yes'),
(50, 35, 1, 'Orange Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_orange.png', 'yes'),
(51, 35, 2, 'Magenta Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_magenta.png', 'yes'),
(52, 35, 3, 'Light Blue Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_light_blue.png', 'yes'),
(53, 35, 4, 'Yellow Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_yellow.png', 'yes'),
(54, 35, 5, 'Lime Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_lime.png', 'yes'),
(55, 35, 6, 'Pink Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_pink.png', 'yes'),
(56, 35, 7, 'Gray Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_gray.png', 'yes'),
(57, 35, 8, 'Light Gray Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_light_gray.png', 'yes'),
(58, 35, 9, 'Cyan Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_cyan.png', 'yes'),
(59, 35, 10, 'Purple Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_purple.png', 'yes'),
(60, 35, 11, 'Blue Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_blue.png', 'yes'),
(61, 35, 12, 'Brown Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_brown.png', 'yes'),
(62, 35, 13, 'Green Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_green.png', 'yes'),
(63, 35, 14, 'Red Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_red.png', 'yes'),
(64, 35, 15, 'Black Wool', 'no', 'no', 0, 'no', 'blocks/wool_colored_black.png', 'yes'),
(65, 37, 0, 'Dandelion', 'no', 'no', 0, 'no', 'blocks/flower_dandelion.png', 'no'),
(66, 38, 0, 'Rose', 'no', 'no', 0, 'no', 'blocks/flower_rose.png', 'no'),
(67, 39, 0, 'Brown Mushroom', 'no', 'no', 0, 'no', 'blocks/mushroom_brown.png', 'no'),
(68, 40, 0, 'Red Mushroom', 'no', 'no', 0, 'no', 'blocks/mushroom_red.png', 'no'),
(69, 41, 0, 'Gold Block', 'no', 'yes', 2340, 'no', 'blocks/gold_block.png', 'yes'),
(70, 42, 0, 'Iron Block', 'no', 'yes', 630, 'no', 'blocks/iron_block.png', 'yes'),
(71, 44, 0, 'Stone Slab', 'no', 'yes', 1, 'no', '', 'no'),
(72, 44, 1, 'Sandstone Slab', 'no', 'yes', 1, 'no', '', 'no'),
(73, 44, 2, 'Wooden Slab', 'no', 'yes', 1, 'no', '', 'no'),
(74, 44, 3, 'Cobblestone Slab', 'no', 'yes', 1, 'no', '', 'no'),
(75, 44, 4, 'Brick Slab', 'no', 'yes', 1, 'no', '', 'no'),
(76, 44, 5, 'Stone Brick Slab', 'no', 'yes', 1, 'no', '', 'no'),
(77, 44, 6, 'Nether Brick Slab', 'no', 'yes', 1, 'no', '', 'no'),
(78, 44, 7, 'Quartz Slab', 'no', 'yes', 1, 'no', '', 'no'),
(79, 45, 0, 'Bricks', 'no', 'yes', 28, 'no', 'blocks/brick.png', 'yes'),
(80, 46, 0, 'TNT', 'no', 'yes', 20, 'no', 'blocks/tnt_side.png', 'yes'),
(81, 47, 0, 'Bookshelf', 'no', 'yes', 21, 'no', 'blocks/bookshelf.png', 'yes'),
(82, 48, 0, 'Mossy Cobblestone', 'no', 'yes', 30, 'no', 'blocks/cobblestone_mossy.png', 'yes'),
(83, 49, 0, 'Obsidian', 'no', 'yes', 190, 'no', 'blocks/obsidian.png', 'yes'),
(84, 50, 0, 'Torch', 'no', 'yes', 5, 'no', 'blocks/torch_on.png', 'no'),
(85, 51, 0, 'Fire', 'no', 'no', 0, 'no', '', 'no'),
(86, 52, 0, 'Monster Spawner', 'no', 'no', 0, 'no', 'blocks/mob_spawner.png', 'no'),
(87, 53, 0, 'Oak Wood Stairs', 'no', 'yes', 4, 'no', '', 'no'),
(88, 54, 0, 'Chest', 'no', 'yes', 17, 'no', '', 'no'),
(89, 56, 0, 'Diamond Ore', 'no', 'yes', 430, 'no', 'blocks/diamond_ore.png', 'yes'),
(90, 57, 0, 'Diamond Block', 'no', 'yes', 3600, 'no', 'blocks/diamond_block.png', 'yes'),
(91, 58, 0, 'Workbench', 'no', 'yes', 9, 'no', 'blocks/crafting_table_front.png', 'yes'),
(92, 61, 0, 'Furnace', 'no', 'yes', 34, 'no', 'blocks/furnace_front_off.png', 'yes'),
(93, 64, 0, 'Ladder', 'no', 'no', 0, 'no', 'blocks/ladder.png', 'no'),
(94, 66, 0, 'Rails', 'no', 'yes', 27, 'no', 'blocks/rail_normal.png', 'no'),
(95, 67, 0, 'Cobblestone Stairs', 'no', 'yes', 7, 'no', '', 'no'),
(96, 69, 0, 'Lever', 'no', 'yes', 6, 'no', 'blocks/lever.png', 'no'),
(97, 70, 0, 'Stone Pressure Plate', 'no', 'yes', 17, 'no', '', 'no'),
(98, 72, 0, 'Wooden Pressure Plate', 'no', 'yes', 5, 'no', '', 'no'),
(99, 73, 0, 'Redstone Ore', 'no', 'yes', 120, 'no', 'blocks/redstone_ore.png', 'yes'),
(100, 76, 0, 'Redstone Torch', 'no', 'yes', 27, 'no', 'blocks/redstone_torch_on.png', 'no'),
(101, 77, 0, 'Stone Button', 'no', 'yes', 8, 'no', '', 'no'),
(102, 78, 0, 'Snow', 'no', 'no', 0, 'no', 'blocks/snow.png', 'yes'),
(103, 79, 0, 'Ice', 'no', 'yes', 8, 'no', 'blocks/ice.png', 'yes'),
(104, 81, 0, 'Cactus', 'no', 'no', 0, 'no', 'blocks/cactus_side.png', 'no'),
(105, 82, 0, 'Clay', 'no', 'yes', 12, 'no', 'blocks/clay.png', 'yes'),
(106, 83, 0, 'Sugar Cane', 'no', 'no', 0, 'no', 'blocks/reeds.png', 'no'),
(107, 84, 0, 'Jukebox', 'no', 'no', 0, 'no', 'blocks/jukebox_top.png', 'yes'),
(108, 85, 0, 'Fence', 'no', 'no', 0, 'no', '', 'no'),
(109, 86, 0, 'Pumpkin', 'no', 'no', 0, 'no', 'blocks/pumpkin_face_off.png', 'no'),
(110, 87, 0, 'Netherrack', 'no', 'yes', 3, 'no', 'blocks/netherrack.png', 'yes'),
(111, 88, 0, 'Soul Sand', 'no', 'yes', 6, 'no', 'blocks/soul_sand.png', 'yes'),
(112, 89, 0, 'Glowstone', 'no', 'yes', 12, 'no', 'blocks/glowstone.png', 'yes'),
(113, 90, 0, 'Portal', 'no', 'no', 0, 'no', 'blocks/portal.png', 'yes'),
(114, 91, 0, 'Jack-O-Lantern', 'no', 'no', 0, 'no', 'blocks/pumpkin_face_on.png', 'yes'),
(115, 93, 0, 'Repeater', 'no', 'no', 0, 'no', 'blocks/repeater_off.png', 'yes'),
(117, 96, 0, 'Trapdoor', 'no', 'no', 0, 'no', 'blocks/trapdoor.png', 'yes'),
(118, 97, 0, 'Silverfish (Stone)', 'no', 'no', 0, 'no', 'blocks/stone.png', 'yes'),
(119, 97, 1, 'Silverfish (Cobblestone)', 'no', 'no', 0, 'no', 'blocks/cobblestone.png', 'yes'),
(120, 97, 2, 'Silverfish (Stone Brick)', 'no', 'no', 0, 'no', 'blocks/stonebrick.png', 'yes'),
(121, 98, 0, 'Stone Brick', 'no', 'yes', 10, 'no', 'blocks/stonebrick.png', 'yes'),
(122, 98, 1, 'Stone Brick (Mossy)', 'no', 'yes', 10, 'no', 'blocks/stonebrick_mossy.png', 'yes'),
(123, 98, 2, 'Stone Brick (Cracked)', 'no', 'yes', 10, 'no', 'blocks/stonebrick_cracked.png', 'yes'),
(124, 98, 3, 'Stone Brick (Chiseled)', 'no', 'yes', 10, 'no', 'blocks/stonebrick_carved.png', 'yes'),
(125, 99, 0, 'Red Mushroom Top', 'no', 'no', 0, 'no', 'blocks/mushroom_block_skin_red.png', 'yes'),
(126, 100, 0, 'Brown Mushroom Top', 'no', 'no', 0, 'no', 'blocks/mushroom_block_skin_brown.png', 'yes'),
(127, 101, 0, 'Iron Bars', 'no', 'no', 0, 'no', 'blocks/iron_bars.png', 'no'),
(128, 102, 0, 'Glass Pane', 'no', 'yes', 3, 'no', 'blocks/glass.png', 'no'),
(129, 103, 0, 'Melon Block', 'no', 'no', 0, 'no', 'blocks/melon_side.png', 'yes'),
(130, 106, 0, 'Vines', 'no', 'no', 0, 'no', 'blocks/vine.png', 'no'),
(131, 107, 0, 'Fence Gate', 'no', 'no', 0, 'no', '', 'no'),
(132, 108, 0, 'Brick Stairs', 'no', 'no', 0, 'no', '', 'no'),
(133, 109, 0, 'Stone Brick Stairs', 'no', 'no', 0, 'no', '', 'no'),
(134, 110, 0, 'Mycelium', 'no', 'yes', 5, 'no', 'blocks/mycelium_side.png', 'yes'),
(135, 111, 0, 'Lily Pad', 'no', 'no', 0, 'no', '', 'no'),
(136, 112, 0, 'Nether Brick', 'no', 'yes', 10, 'no', 'blocks/nether_brick.png', 'yes'),
(137, 113, 0, 'Nether Brick Fence', 'no', 'no', 0, 'no', '', 'no'),
(138, 114, 0, 'Nether Brick Stairs', 'no', 'no', 0, 'no', '', 'no'),
(139, 115, 0, 'Nether Wart', 'no', 'no', 0, 'no', 'blocks/nether_wart_stage_0.png', 'no'),
(140, 116, 0, 'Enchantment Table', 'no', 'no', 0, 'no', 'blocks/enchanting_table_top.png', 'yes'),
(141, 117, 0, 'Brewing Stand', 'no', 'no', 0, 'no', 'blocks/brewing_stand.png', 'no'),
(142, 118, 0, 'Cauldron', 'no', 'no', 0, 'no', 'blocks/cauldron_side.png', 'no'),
(143, 121, 0, 'End Stone', 'no', 'yes', 12, 'no', 'blocks/end_stone.png', 'yes'),
(144, 122, 0, 'Dragon Egg', 'no', 'no', 0, 'no', '', 'no'),
(145, 123, 0, 'Redstone Lamp', 'no', 'no', 0, 'no', 'blocks/redstone_lamp_off.png', 'yes'),
(146, 126, 0, 'Oak Wood Slab', 'no', 'yes', 1, 'no', '', 'no'),
(147, 126, 1, 'Spruce Wood Slab', 'no', 'yes', 1, 'no', '', 'no'),
(148, 126, 2, 'Birch Wood Slab', 'no', 'yes', 1, 'no', '', 'no'),
(149, 126, 3, 'Jungle Wood Slab', 'no', 'yes', 1, 'no', '', 'no'),
(150, 128, 0, 'Sandstone Stairs', 'no', 'no', 0, 'no', '', 'no'),
(151, 129, 0, 'Emerald Ore', 'no', 'yes', 450, 'no', 'blocks/emerald_ore.png', 'yes'),
(152, 130, 0, 'Ender Chest', 'no', 'no', 0, 'no', '', 'no'),
(153, 131, 0, 'Tripwire Hook', 'no', 'no', 0, 'no', 'blocks/trip_wire_source.png', 'no'),
(154, 133, 0, 'Emerald Block', 'no', 'no', 0, 'no', 'blocks/emerald_block.png', 'yes'),
(155, 134, 0, 'Spruce Wood Stairs', 'no', 'no', 0, 'no', '', 'no'),
(156, 135, 0, 'Birch Wood Stairs', 'no', 'no', 0, 'no', '', 'no'),
(157, 136, 0, 'Jungle Wood Stairs', 'no', 'no', 0, 'no', '', 'no'),
(158, 137, 0, 'Command Block', 'no', 'no', 0, 'no', 'blocks/command_block.png', 'yes'),
(159, 138, 0, 'Beacon', 'no', 'no', 0, 'no', 'blocks/beacon.png', 'yes'),
(160, 139, 0, 'Cobblestone Wall', 'no', 'no', 0, 'no', '', 'no'),
(161, 139, 1, 'Cobblestone Wall (Mossy)', 'no', 'no', 0, 'no', '', 'no'),
(162, 310, 0, 'Diamond Helmet', 'no', 'no', 0, 'no', 'items/diamond_helmet.png', 'no'),
(163, 311, 0, 'Diamond Chestplate', 'no', 'no', 0, 'no', 'items/diamond_chestplate.png', 'no'),
(164, 312, 0, 'Diamond Leggings', 'no', 'no', 0, 'no', 'items/diamond_leggings.png', 'no'),
(165, 313, 0, 'Diamond Boots', 'no', 'no', 0, 'no', 'items/diamond_boots.png', 'no'),
(166, 298, 0, 'Leather Helmet', 'no', 'no', 0, 'no', 'items/leather_helmet.png', 'no'),
(167, 299, 0, 'Leather Chestplate', 'no', 'no', 0, 'no', 'items/leather_chestplate.png', 'no'),
(168, 300, 0, 'Leather Leggings', 'no', 'no', 0, 'no', 'items/leather_leggings.png', 'no'),
(169, 301, 0, 'Leather Boots', 'no', 'no', 0, 'no', 'items/leather_boots.png', 'no'),
(170, 302, 0, 'Chainmail Helmet', 'no', 'no', 0, 'no', 'items/chainmail_helmet.png', 'no'),
(171, 303, 0, 'Chainmail Chestplate', 'no', 'no', 0, 'no', 'items/chainmail_chestplate.png', 'no'),
(172, 304, 0, 'Chainmail Leggings', 'no', 'no', 0, 'no', 'items/chainmail_leggings.png', 'no'),
(173, 305, 0, 'Chainmail Boots', 'no', 'no', 0, 'no', 'items/chainmail_boots.png', 'no'),
(174, 306, 0, 'Iron Helmet', 'no', 'no', 0, 'no', 'items/iron_helmet.png', 'no'),
(175, 307, 0, 'Iron Chestplate', 'no', 'no', 0, 'no', 'items/iron_chestplate.png', 'no'),
(176, 308, 0, 'Iron Leggings', 'no', 'no', 0, 'no', 'items/iron_leggings.png', 'no'),
(177, 309, 0, 'Iron Boots', 'no', 'no', 0, 'no', 'items/iron_boots.png', 'no'),
(178, 314, 0, 'Golden Helmet', 'no', 'no', 0, 'no', 'items/gold_helmet.png', 'no'),
(179, 315, 0, 'Golden Chestplate', 'no', 'no', 0, 'no', 'items/gold_chestplate.png', 'no'),
(180, 316, 0, 'Golden Leggings', 'no', 'no', 0, 'no', 'items/gold_leggings.png', 'no'),
(181, 317, 0, 'Golden Boots', 'no', 'no', 0, 'no', 'items/gold_boots.png', 'no'),
(183, 568, 0, 'Wooden Sword', 'no', 'no', 0, 'no', 'items/wood_sword.png', 'no'),
(184, 569, 0, 'Wooden Shovel', 'no', 'no', 0, 'no', 'items/wood_shovel.png', 'no'),
(185, 570, 0, 'Wooden Pickaxe', 'no', 'no', 0, 'no', 'items/wood_pickaxe.png', 'no'),
(186, 571, 0, 'Wooden Axe', 'no', 'no', 0, 'no', 'items/wood_axe.png', 'no'),
(187, 152, 0, 'Redstone Block', 'no', 'yes', 225, 'no', '', 'no'),
(188, 153, 0, 'Quartz Ore', 'no', 'yes', 50, 'no', '', 'no'),
(189, 155, 0, 'Quartz Block', 'no', 'yes', 140, 'no', '', 'no'),
(190, 159, 0, 'Stained Clay', 'no', 'yes', 10, 'no', '', 'no'),
(191, 161, 0, 'Leaves (Acacia)', 'no', 'yes', 8, 'no', '', 'no'),
(192, 162, 0, 'Log (Acacia)', 'no', 'yes', 8, 'no', '', 'no'),
(193, 172, 0, 'Hardened Clay', 'no', 'yes', 10, 'no', '', 'no'),
(194, 173, 0, 'Coal Block', 'no', 'yes', 180, 'no', '', 'no'),
(195, 174, 0, 'Compressed Ice', 'no', 'yes', 24, 'no', '', 'no'),
(196, 263, 0, 'Coal', 'no', 'yes', 20, 'yes', '', 'no'),
(197, 264, 0, 'Diamond', 'no', 'yes', 400, 'no', '', 'no'),
(198, 265, 0, 'Iron Ingot', 'no', 'yes', 70, 'no', '', 'no'),
(199, 266, 0, 'Gold Ingot', 'no', 'yes', 260, 'no', '', 'no'),
(200, 318, 0, 'Flint', 'no', 'yes', 11, 'no', '', 'no'),
(201, 331, 0, 'Redstone Dust', 'no', 'yes', 25, 'no', '', 'no'),
(202, 336, 0, 'Brick', 'no', 'yes', 6, 'no', '', 'no'),
(203, 337, 0, 'Clay', 'no', 'yes', 3, 'no', '', 'no'),
(204, 348, 0, 'Glowstone Dust', 'no', 'yes', 3, 'no', '', 'no'),
(205, 371, 0, 'Gold Nugget', 'no', 'yes', 29, 'no', '', 'no'),
(206, 406, 0, 'Nether Quartz', 'no', 'yes', 35, 'no', '', 'no');
