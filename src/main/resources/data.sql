-- Seed data for local/dev usage.
insert into `user` (user_id, username, email, avatar_url, created_at) VALUES
  ('11111111-1111-1111-1111-111111111111', 'pinky', 'pinky@example.com', 'https://example.com/avatars/pinky.png', '2026-01-01 09:00:00'),
  ('22222222-2222-2222-2222-222222222222', 'maya', 'maya@example.com', 'https://example.com/avatars/maya.png', '2026-01-02 10:30:00'),
  ('33333333-3333-3333-3333-333333333333', 'ravi', 'ravi@example.com', 'https://example.com/avatars/ravi.png', '2026-01-03 14:15:00');

insert into movie (movie_id, title, synopsis, release_date, duration_minutes, genre, language, poster_url, created_at) values
  ('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 'City of Echoes', 'A sound engineer uncovers a hidden message in old recordings.', '2024-11-15', 112, 'Thriller', 'English', 'https://example.com/posters/echoes.jpg', '2026-01-10 12:00:00'),
  ('bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 'Desert Bloom', 'An ecologist fights to save a fading oasis.', '2023-06-02', 98, 'Drama', 'English', 'https://example.com/posters/bloom.jpg', '2026-01-11 08:45:00'),
  ('cccccccc-cccc-cccc-cccc-cccccccccccc', 'Starlight Run', 'A rookie pilot races to deliver medicine across a collapsing empire.', '2025-03-21', 129, 'Sci-Fi', 'English', 'https://example.com/posters/starlight.jpg', '2026-01-12 18:20:00');

insert into review (id, user_id, movie_id, rating, content, reaction_tags, created_at) values
  ('dddddddd-dddd-dddd-dddd-dddddddddddd', '11111111-1111-1111-1111-111111111111', 'aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', 5, 'Tense and beautifully scored.', 'edge-of-seat,cinematic', '2026-01-15 20:10:00'),
  ('eeeeeeee-eeee-eeee-eeee-eeeeeeeeeeee', '22222222-2222-2222-2222-222222222222', 'bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', 4, 'Thoughtful story with great pacing.', 'uplifting,slow-burn', '2026-01-16 09:05:00'),
  ('ffffffff-ffff-ffff-ffff-ffffffffffff', '33333333-3333-3333-3333-333333333333', 'cccccccc-cccc-cccc-cccc-cccccccccccc', 3, 'Fun visuals, thin plot.', 'visuals,action', '2026-01-17 22:40:00');
