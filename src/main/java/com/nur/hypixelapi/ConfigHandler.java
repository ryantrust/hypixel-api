package com.nur.hypixelapi;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static Configuration config;
    private static String file = "config/" + HypixelAPIMod.MODID + ".cfg";

    public static void init() {
        config = new Configuration(new File(file));

        try {
            config.load();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void removeConfig(String category) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.hasCategory(category)) {
                config.removeCategory(new ConfigCategory(category));
            }
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void removeConfig(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) config.getCategory(category).remove(key);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }
    }

    public static int getInt(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (!config.getCategory(category).containsKey(key)) {
                return 0;
            }

            return config.get(category, key, 0).getInt();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
            return 0;
        } finally {
            config.save();
        }

    }

    public static int getInt(String category, String key, int defaultValue) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {
                return config.get(category, key, 0).getInt();
            }

            setInt(category, key, defaultValue);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return defaultValue;
    }

    public static double getDouble(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (!config.getCategory(category).containsKey(key)) {
                return 0.0D;
            }

            return config.get(category, key, 0.0D).getDouble();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
            return 0.0D;
        } finally {
            config.save();
        }

    }

    public static double getDouble(String category, String key, Double defaultValue) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {
                return config.get(category, key, 0.0D).getDouble();
            }

            setDouble(category, key, defaultValue);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return defaultValue;
    }

    public static float getFloat(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (!config.getCategory(category).containsKey(key)) {
                return 0.0F;
            }

            return (float) config.get(category, key, 0.0D).getDouble();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
            return 0.0F;
        } finally {
            config.save();
        }

    }

    public static float getFloat(String category, String key, Float defaultValue) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {
                return (float) config.get(category, key, 0.0D).getDouble();
            }

            setFloat(category, key, defaultValue);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return defaultValue;
    }

    public static String getString(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (!config.getCategory(category).containsKey(key)) {
                return "";
            }

            return config.get(category, key, "").getString();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
            return "";
        } finally {
            config.save();
        }

    }

    public static String getString(String category, String key, String defaultValue) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {
                return config.get(category, key, "").getString();
            }

            setString(category, key, defaultValue);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return defaultValue;
    }

    public static short getShort(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (!config.getCategory(category).containsKey(key)) {
                return 0;
            }

            return (short) config.get(category, key, 0).getInt();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
            return 0;
        } finally {
            config.save();
        }

    }

    public static short getShort(String category, String key, short defaultValue) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {
                return (short) config.get(category, key, 0).getInt();
            }

            setShort(category, key, defaultValue);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return defaultValue;
    }

    public static byte getByte(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (!config.getCategory(category).containsKey(key)) {
                return 0;
            }

            return (byte) config.get(category, key, 0).getInt();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
            return 0;
        } finally {
            config.save();
        }

    }

    public static byte getByte(String category, String key, byte defaultValue) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {
                return (byte) config.get(category, key, 0).getInt();
            }

            setByte(category, key, defaultValue);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return defaultValue;
    }

    public static boolean getBoolean(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (!config.getCategory(category).containsKey(key)) return false;

            return config.get(category, key, false).getBoolean();
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
            return false;
        } finally {
            config.save();
        }

    }

    public static boolean getBoolean(String category, String key, boolean defaultValue) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.getCategory(category).containsKey(key)) {
                return config.get(category, key, false).getBoolean();
            }

            setBoolean(category, key, defaultValue);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return defaultValue;
    }


    public static void setString(String category, String key, String value) {
        config = new Configuration(new File(file));

        try {
            config.load();
            String set = config.get(category, key, value).getString();
            config.getCategory(category).get(key).set(value);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void setInt(String category, String key, int value) {
        config = new Configuration(new File(file));

        try {
            config.load();
            int set = config.get(category, key, value).getInt();
            config.getCategory(category).get(key).set(value);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void setBoolean(String category, String key, boolean value) {
        config = new Configuration(new File(file));

        try {
            config.load();
            boolean set = config.get(category, key, value).getBoolean();
            config.getCategory(category).get(key).set(value);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void setDouble(String category, String key, double value) {
        config = new Configuration(new File(file));

        try {
            config.load();
            double set = config.get(category, key, value).getDouble();
            config.getCategory(category).get(key).set(value);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void setShort(String category, String key, short value) {
        config = new Configuration(new File(file));

        try {
            config.load();
            int set = config.get(category, key, value).getInt();
            config.getCategory(category).get(key).set(value);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void setByte(String category, String key, byte value) {
        config = new Configuration(new File(file));

        try {
            config.load();
            int set = config.get(category, key, value).getInt();
            config.getCategory(category).get(key).set(value);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }

    public static void setFloat(String category, String key, float value) {
        config = new Configuration(new File(file));

        try {
            config.load();
            double set = config.get(category, key, (double) value).getDouble();
            config.getCategory(category).get(key).set((double) value);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

    }


    public static boolean hasCategory(String category) {
        config = new Configuration(new File(file));

        try {
            config.load();
            return config.hasCategory(category);
        } catch (Exception exception) {
            System.out.println("Cannot load configuration file!");
        } finally {
            config.save();
        }

        return false;
    }

    public static boolean hasKey(String category, String key) {
        config = new Configuration(new File(file));

        try {
            config.load();
            if (config.hasCategory(category)) {
                return config.getCategory(category).containsKey(key);
            }
        } catch (Exception ex) {
            System.out.println("Cannot load configuration file!");
            ex.printStackTrace();
            return false;
        } finally {
            config.save();
        }

        return false;
    }

    public static void setFile(String filename) {
        file = "config/" + filename;
    }

    public static String getFile() {
        return file;
    }
}


